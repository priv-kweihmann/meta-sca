SUMMARY = "NPM: pluralize"
DESCRIPTION = "Pluralize and singularize any word"
HOMEPAGE = "https://github.com/blakeembrey/pluralize"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7eeeb5a4f2ac933c251575809e29300c"

SRC_URI = "https://registry.npmjs.org/pluralize/-/pluralize-2.0.0.tgz"
SRC_URI[md5sum] = "0c451d76b12fcf51b6b3043c94a7d671"
SRC_URI[sha256sum] = "79b899c5f4a3568098833a657fdbf1cf2edd171bbd3d586c7484ea42a4a84a20"

NPM_PKGNAME = "pluralize"

inherit npmhelper
inherit native
