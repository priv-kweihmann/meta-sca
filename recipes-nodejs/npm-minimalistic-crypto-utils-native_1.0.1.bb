SUMMARY = "NPM: minimalistic-crypto-utils"
DESCRIPTION = "Minimalistic tools for JS crypto modules"
HOMEPAGE = "https://github.com/indutny/minimalistic-crypto-utils#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=20;md5=f400cfd20c6a577a48eb7681ef276da2"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/minimalistic-crypto-utils/-/minimalistic-crypto-utils-1.0.1.tgz"
SRC_URI[md5sum] = "07ce57f49f891f1d16d513ccb1c89971"
SRC_URI[sha256sum] = "f35f6e02efe1b2d6e8764fea48ef6d1211693c838f54d6ef50f0bc9fe6fa9db3"

NPM_PKGNAME = "minimalistic-crypto-utils"

inherit npmhelper
inherit native
