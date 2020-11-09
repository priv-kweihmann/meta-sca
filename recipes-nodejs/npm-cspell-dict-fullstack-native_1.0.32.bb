SUMMARY = "NPM: cspell-dict-fullstack"
DESCRIPTION = "Dictionary of terms used in Fullstack development."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fullstack#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fullstack/-/cspell-dict-fullstack-1.0.32.tgz"
SRC_URI[md5sum] = "37386d980533ad3dc17a87d121c0b893"
SRC_URI[sha256sum] = "fc6aa504bcbbfd9d38e2ded63677a6ebfab36618c4b1ee7671db5d6c92e96c66"

NPM_PKGNAME = "cspell-dict-fullstack"

inherit npmhelper
inherit native
