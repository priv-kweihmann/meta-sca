SUMMARY = "NPM: longest-streak"
DESCRIPTION = "Count the longest repeating streak of a character"
HOMEPAGE = "https://github.com/wooorm/longest-streak#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=7e5307a85144ae88c8ce8eb803918a97"

SRC_URI = "https://registry.npmjs.org/longest-streak/-/longest-streak-2.0.4.tgz"
SRC_URI[md5sum] = "47ca866327b783f59b073c62e6c49924"
SRC_URI[sha256sum] = "7b283f7872455dbba23c9c5183a43d83b23b1c23fb99a7e6d72412a0921f62e3"

NPM_PKGNAME = "longest-streak"

inherit npmhelper
inherit native
