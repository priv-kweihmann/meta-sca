SUMMARY = "NPM: is-yarn-global"
DESCRIPTION = "Check if installed by yarn globally without any `fs` calls"
HOMEPAGE = "https://github.com/LitoMore/is-yarn-global#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=70e5c3ddb07f13a85007f15c0792b800"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-yarn-global/-/is-yarn-global-0.3.0.tgz"
SRC_URI[md5sum] = "50f191e3e0626106ce57a9a5a2be0e63"
SRC_URI[sha256sum] = "80aadc7b46dbb9f060a135c52aafcd0f516a029272649828dd25b52860b849f5"

NPM_PKGNAME = "is-yarn-global"

inherit npmhelper
inherit native
