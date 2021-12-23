SUMMARY = "NPM: clean-regexp"
DESCRIPTION = "Clean up regular expressions"
HOMEPAGE = "https://github.com/samverschueren/clean-regexp#readme"

DEPENDS = "npm-escape-string-regexp-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a775f12cfff35aa8881152fa96fb8d0a"

SRC_URI = "https://registry.npmjs.org/clean-regexp/-/clean-regexp-1.0.0.tgz"
SRC_URI[md5sum] = "0a74ec2e86521722b6fe828b0d5f557c"
SRC_URI[sha256sum] = "69436b7eb382196c7624997ddd47f47835d0cd12e03a95096dade51e4285cf31"

NPM_PKGNAME = "clean-regexp"

inherit npmhelper
inherit native
