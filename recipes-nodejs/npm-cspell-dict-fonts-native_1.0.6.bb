SUMMARY = "NPM: cspell-dict-fonts"
DESCRIPTION = "Font names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/fonts#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-fonts/-/cspell-dict-fonts-1.0.6.tgz"
SRC_URI[md5sum] = "70819f63ec21feeb71286530eaae989a"
SRC_URI[sha256sum] = "23294aa0f71135817ea34bcc72a67c4258ec847b6580fc57627a2910c57d3454"

NPM_PKGNAME = "cspell-dict-fonts"

inherit npmhelper
inherit native
