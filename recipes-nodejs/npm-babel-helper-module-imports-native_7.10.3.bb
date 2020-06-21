SUMMARY = "NPM: @babel/helper-module-imports"
DESCRIPTION = "Babel helper functions for inserting module loads"
HOMEPAGE = "https://babeljs.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-module-imports/-/helper-module-imports-7.10.3.tgz"
SRC_URI[md5sum] = "7bc9add66a77374fa6a9beec3702d40b"
SRC_URI[sha256sum] = "1ec1a725648e796606850703d5abeb1c13b6780ac2b24a17ae13501bc603e98f"

NPM_PKGNAME = "@babel/helper-module-imports"

inherit npmhelper
inherit native
