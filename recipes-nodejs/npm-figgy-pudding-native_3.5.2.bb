SUMMARY = "NPM: figgy-pudding"
DESCRIPTION = "Delicious, festive, cascading config/opts definitions"
HOMEPAGE = "https://github.com/npm/figgy-pudding#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=5324d196a847002a5d476185a59cf238"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/figgy-pudding/-/figgy-pudding-3.5.2.tgz"
SRC_URI[md5sum] = "4737c03be7bf7b9227b1da41992dc35b"
SRC_URI[sha256sum] = "997de16d9f14d88a5dcd6e7b0216cb91af7152c771c4bad73819eba8aafee16c"

NPM_PKGNAME = "figgy-pudding"

inherit npmhelper
inherit native
