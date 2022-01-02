SUMMARY = "NPM: @babel/helper-hoist-variables"
DESCRIPTION = "Helper function to hoist variables"
HOMEPAGE = "https://babel.dev/docs/en/next/babel-helper-hoist-variables"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-babel-types-native"

SRC_URI = "https://registry.npmjs.org/@babel/helper-hoist-variables/-/helper-hoist-variables-7.16.7.tgz"
SRC_URI[md5sum] = "757d50721db19a62b2b9411b070d6e58"
SRC_URI[sha256sum] = "72b2c9684e5628ed942f7e608ff79ddc74e4a66a088c5ef10597b4050a4b88bb"

NPM_PKGNAME = "@babel/helper-hoist-variables"

inherit npmhelper
inherit native
