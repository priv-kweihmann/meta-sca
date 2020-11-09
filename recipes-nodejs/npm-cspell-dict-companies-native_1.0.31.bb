SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.0.31.tgz"
SRC_URI[md5sum] = "c8772fdd82a623a8cc5886c5e13a07be"
SRC_URI[sha256sum] = "f29753bd206440c76db18ca6b07b3c2569b44fbdfb243a68dfaf8383a3fa822f"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
