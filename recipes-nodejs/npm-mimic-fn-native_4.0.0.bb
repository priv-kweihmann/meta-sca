SUMMARY = "NPM: mimic-fn"
DESCRIPTION = "Make a function mimic another one"
HOMEPAGE = "https://github.com/sindresorhus/mimic-fn#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/mimic-fn/-/mimic-fn-4.0.0.tgz"
SRC_URI[md5sum] = "a72127ffad2a02314b21f92999690c6d"
SRC_URI[sha256sum] = "a3ca7298c100273c5144dc4cb90788ff422666f9ca05201e557368c69c9b93a9"

NPM_PKGNAME = "mimic-fn"

inherit npmhelper
inherit native
