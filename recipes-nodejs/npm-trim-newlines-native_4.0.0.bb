SUMMARY = "NPM: trim-newlines"
DESCRIPTION = "Trim newlines from the start and/or end of a string"
HOMEPAGE = "https://github.com/sindresorhus/trim-newlines#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trim-newlines/-/trim-newlines-4.0.0.tgz"
SRC_URI[md5sum] = "4d17c895b9ccbd1b655c34858efab918"
SRC_URI[sha256sum] = "1a34a4a6452b4f1764cc5eabed495e7301341f35087b2df985e5449c6d7f7141"

NPM_PKGNAME = "trim-newlines"

inherit npmhelper
inherit native
