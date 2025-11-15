# SPDX-License-Identifier: BSD-2-Clause
# Copyright (c) 2025, Konrad Weihmann
# remove the target side perl from the nativesdk build

RDEPENDS:${PN}:append:class-nativesdk = " nativesdk-perl"
RDEPENDS:${PN}:remove:class-nativesdk = "perl"
