package com.nextcloud.android.sso.helper;

import com.nextcloud.android.sso.aidl.NextcloudRequest;
import com.nextcloud.android.sso.api.NextcloudAPI;

import io.reactivex.Completable;
import io.reactivex.functions.Action;

/**
 *  Nextcloud SingleSignOn
 *
 *  @author David Luhmer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

public class ReactivexHelper {

    public static Completable WrapInCompletable(final NextcloudAPI nextcloudAPI, final NextcloudRequest request) {
        return Completable.fromAction(new Action() {
            @Override
            public void run() throws Exception {
                nextcloudAPI.performRequest(Void.class, request);
            }
        });
    }

}

