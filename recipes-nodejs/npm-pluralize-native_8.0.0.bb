SUMMARY = "NPM: pluralize"
DESCRIPTION = "Pluralize and singularize any word"
HOMEPAGE = "https://github.com/blakeembrey/pluralize#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7eeeb5a4f2ac933c251575809e29300c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/pluralize/-/pluralize-8.0.0.tgz"
SRC_URI[md5sum] = "9f8ff8f3198967c07451a6a6bf71f0e3"
SRC_URI[sha256sum] = "984464a74e8a33c18d2760e162533a68eb772574b0816918f738e2b27ef5b695"

NPM_PKGNAME = "pluralize"

inherit npmhelper
inherit native
