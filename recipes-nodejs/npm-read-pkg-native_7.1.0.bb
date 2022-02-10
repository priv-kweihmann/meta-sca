SUMMARY = "NPM: read-pkg"
DESCRIPTION = "Read a package.json file"
HOMEPAGE = "https://github.com/sindresorhus/read-pkg#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-normalize-package-data-native \
           npm-parse-json-native \
           npm-type-fest-native \
           npm-types-normalize-package-data-native"

SRC_URI = "https://registry.npmjs.org/read-pkg/-/read-pkg-7.1.0.tgz"
SRC_URI[md5sum] = "f8565a076c14180d5e3f9c8bcb9bc897"
SRC_URI[sha256sum] = "63c5d67421387ad043ce3cbfed4c3070f5f2a1fcc44489d7766336de18c5b9d1"

NPM_PKGNAME = "read-pkg"

inherit npmhelper
inherit native
