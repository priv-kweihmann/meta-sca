SUMMARY = "NPM: is-regexp"
DESCRIPTION = "Check if a value is a regular expression"
HOMEPAGE = "https://github.com/sindresorhus/is-regexp#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-regexp/-/is-regexp-3.0.0.tgz"
SRC_URI[md5sum] = "beb94a8a639539d353c164584a8462d8"
SRC_URI[sha256sum] = "6804495a2096bf6deab84a4ec14b03bae3b05ffa768dee63731ad1a4c8b94412"

NPM_PKGNAME = "is-regexp"

inherit npmhelper
inherit native
