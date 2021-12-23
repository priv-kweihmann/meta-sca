SUMMARY = "NPM: dir-glob"
DESCRIPTION = "Convert directories to glob compatible strings"
HOMEPAGE = "https://github.com/kevva/dir-glob#readme"

DEPENDS = "npm-path-type-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=05240cd20679544d6e90fcff746425bc"

SRC_URI = "https://registry.npmjs.org/dir-glob/-/dir-glob-3.0.1.tgz"
SRC_URI[md5sum] = "3bbb5707778e69886241486da1c73988"
SRC_URI[sha256sum] = "77567a31921b70dc16b42fc727acbaa54577d2eed38c7d9ea6ad1c71711c4572"

NPM_PKGNAME = "dir-glob"

inherit npmhelper
inherit native
