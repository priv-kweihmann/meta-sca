SUMMARY = "NPM: postcss-media-query-parser"
DESCRIPTION = "A tool for parsing media query lists."
HOMEPAGE = "https://github.com/dryoma/postcss-media-query-parser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=173;md5=9e62bd89a102fe4153009f3554702c9e"

SRC_URI = "https://registry.npmjs.org/postcss-media-query-parser/-/postcss-media-query-parser-0.2.3.tgz"
SRC_URI[md5sum] = "916872cd17e6a09b2f45f20f3191d67e"
SRC_URI[sha256sum] = "f6067d08940a870847026958289d845f6171859895b9b3b098b869fb3067d296"

NPM_PKGNAME = "postcss-media-query-parser"

inherit npmhelper
inherit native
