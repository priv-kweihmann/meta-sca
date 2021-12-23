SUMMARY = "NPM: normalize-glob"
DESCRIPTION = "Normalize a glob pattern by expanding braces, making it absolute and resolving parent directories '..'"
HOMEPAGE = "https://github.com/ajafff/normalize-glob#readme"

DEPENDS = "npm-brace-expansion-native npm-is-negated-glob-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d1f94b2d3cb383f35ab646ca0e5e0718"

SRC_URI = "https://registry.npmjs.org/normalize-glob/-/normalize-glob-0.0.2.tgz"
SRC_URI[md5sum] = "e3329c7a05d91eda61586fa43c2bccf4"
SRC_URI[sha256sum] = "078f88489c34abc9521a30a73958799204e53565410680e3636e13b849bf05b3"

NPM_PKGNAME = "normalize-glob"

inherit npmhelper
inherit native
