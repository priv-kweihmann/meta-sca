SUMMARY = "NPM: co"
DESCRIPTION = "generator async control flow goodness"
HOMEPAGE = "https://github.com/tj/co#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1cb994f27906c83d46a3cc6d9e1d8d6c"

SRC_URI = "https://registry.npmjs.org/co/-/co-4.6.0.tgz"
SRC_URI[md5sum] = "b6f068b290c84d37007997c45148ad18"
SRC_URI[sha256sum] = "21d4362a4a3822e68fe1852409381dd0be9851756eabfbf6d0723ef51e39cf98"

NPM_PKGNAME = "co"

inherit npmhelper
inherit native
