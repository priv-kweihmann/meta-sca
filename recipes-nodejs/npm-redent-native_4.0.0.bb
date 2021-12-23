SUMMARY = "NPM: redent"
DESCRIPTION = "Strip redundant indentation and indent the string"
HOMEPAGE = "https://github.com/sindresorhus/redent#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-indent-string-native \
           npm-strip-indent-native"

SRC_URI = "https://registry.npmjs.org/redent/-/redent-4.0.0.tgz"
SRC_URI[md5sum] = "5649d292dd5895e21afe169c021a924d"
SRC_URI[sha256sum] = "0c4e4a077f8d4b2ad869d11b562513ca12f49ebf54f78a07e02f109ce2c91b67"

NPM_PKGNAME = "redent"

inherit npmhelper
inherit native
