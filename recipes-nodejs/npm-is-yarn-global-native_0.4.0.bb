SUMMARY = "NPM: is-yarn-global"
DESCRIPTION = "Check if installed by yarn globally without any `fs` calls"
HOMEPAGE = "https://github.com/LitoMore/is-yarn-global#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=70e5c3ddb07f13a85007f15c0792b800"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-yarn-global/-/is-yarn-global-0.4.0.tgz"
SRC_URI[md5sum] = "ea45c1b9eb267f12ce2f7e614ae7e6bc"
SRC_URI[sha256sum] = "9a35c5249abd9980fc571ee7083490f96079defe099518abe5225ed660461278"

NPM_PKGNAME = "is-yarn-global"

inherit npmhelper
inherit native
