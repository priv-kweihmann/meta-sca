SUMMARY = "NPM: split-lines"
DESCRIPTION = "Split lines into an array of lines"
HOMEPAGE = "https://github.com/sindresorhus/split-lines#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/split-lines/-/split-lines-3.0.0.tgz"
SRC_URI[md5sum] = "5d1b62a6fda30e9e2f2394c37acb7939"
SRC_URI[sha256sum] = "a20b14785c6873a7e169c1c249833b6235f147b421488f28f175acbfa9364a02"

NPM_PKGNAME = "split-lines"

inherit npmhelper
inherit native
