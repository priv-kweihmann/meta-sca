SUMMARY = "NPM: pluralize"
DESCRIPTION = "Pluralize and singularize any word"
HOMEPAGE = "https://github.com/blakeembrey/pluralize#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7eeeb5a4f2ac933c251575809e29300c"

SRC_URI = "https://registry.npmjs.org/pluralize/-/pluralize-7.0.0.tgz"
SRC_URI[md5sum] = "5e6a466e5bb66d2650a5c39903417f26"
SRC_URI[sha256sum] = "2ff2992191c8ffeef83202f401a07dca56736c9ba2b87e837368b3135165fc17"

NPM_PKGNAME = "pluralize"

inherit npmhelper
inherit native
