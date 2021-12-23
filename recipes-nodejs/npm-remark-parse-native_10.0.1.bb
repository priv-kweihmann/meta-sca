SUMMARY = "NPM: remark-parse"
DESCRIPTION = "remark plugin to add support for parsing markdown input"
HOMEPAGE = "https://remark.js.org"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=11edd66fd34c2e93c27d1e7a4f248ee3"

DEPENDS = "npm-mdast-util-from-markdown-native \
           npm-types-mdast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/remark-parse/-/remark-parse-10.0.1.tgz"
SRC_URI[md5sum] = "828800316e70fb98fb8c527deff6849c"
SRC_URI[sha256sum] = "5178fee61f1c2c2fa1c09932dad9e425abcfc2708d8050fa66cfb5f7d16e6fcb"

NPM_PKGNAME = "remark-parse"

inherit npmhelper
inherit native
