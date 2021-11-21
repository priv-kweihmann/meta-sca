SUMMARY = "NPM: postcss-value-parser"
DESCRIPTION = "Transforms css values and at-rule params into the tree"
HOMEPAGE = "https://github.com/TrySound/postcss-value-parser"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=192f05d9cfe483ed2a4511ffd5af5895"

SRC_URI = "https://registry.npmjs.org/postcss-value-parser/-/postcss-value-parser-4.1.0.tgz"
SRC_URI[md5sum] = "f63bac7136469dbaeaab9e8233f672d0"
SRC_URI[sha256sum] = "0f5a5448ca2fa7f2b5302071165b75af439976866a51fa5fa4fff1eb370d2860"

NPM_PKGNAME = "postcss-value-parser"

inherit npmhelper
inherit native
