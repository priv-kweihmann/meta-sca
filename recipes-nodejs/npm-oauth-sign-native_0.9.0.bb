SUMMARY = "NPM: oauth-sign"
DESCRIPTION = "OAuth 1 signing. Formerly a vendor lib in mikeal/request, now a standalone module."
HOMEPAGE = "https://github.com/mikeal/oauth-sign#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3f8ead5440d1c311b45be065d135d90"

SRC_URI = "https://registry.npmjs.org/oauth-sign/-/oauth-sign-0.9.0.tgz"
SRC_URI[md5sum] = "e0f32f9b22c3f5a48bce7ba4c75dd751"
SRC_URI[sha256sum] = "0016af1761003d0c45eb7bdc965561b518c1c1c6b8885d4967fd1ab4afa0d9bc"

S = "${WORKDIR}/package"

NPM_PKGNAME = "oauth-sign"

inherit npmhelper
inherit native
