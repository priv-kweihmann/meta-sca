SUMMARY = "NPM: term-size"
DESCRIPTION = "Reliably get the terminal window size (columns & rows)"
HOMEPAGE = "https://github.com/sindresorhus/term-size#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/term-size/-/term-size-2.2.1.tgz"
SRC_URI[md5sum] = "da2df638ac31cfb50d02d8dbbd8147ba"
SRC_URI[sha256sum] = "7ece665effebd85723bcd763af821acaa6dc29ca504b0ebb7d8ca1e2e49f6e46"

NPM_PKGNAME = "term-size"

inherit npmhelper
inherit native
