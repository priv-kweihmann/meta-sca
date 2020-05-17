SUMMARY = "NPM: astral-regex"
DESCRIPTION = "Regular expression for matching astral symbols"
HOMEPAGE = "https://github.com/kevva/astral-regex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=05240cd20679544d6e90fcff746425bc"

SRC_URI = "https://registry.npmjs.org/astral-regex/-/astral-regex-1.0.0.tgz"
SRC_URI[md5sum] = "7e3fa8701bbf9b7232e0dfc13b5bd9d7"
SRC_URI[sha256sum] = "51aa3a79c6558184d689e50e9a29a1fdbdb9d13930cd965c219b4a45eff6dab5"

NPM_PKGNAME = "astral-regex"

inherit npmhelper
inherit native
