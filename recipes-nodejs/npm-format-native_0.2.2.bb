SUMMARY = "NPM: format"
DESCRIPTION = "printf, sprintf, and vsprintf for JavaScript"
HOMEPAGE = "http://samhuri.net/proj/format"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Readme.md;beginline=43;md5=4feb6f89c4a4849acbc98f694cf325ea"

SRC_URI = "https://registry.npmjs.org/format/-/format-0.2.2.tgz"
SRC_URI[md5sum] = "d2afc5280d909cfb103765ba1248dd98"
SRC_URI[sha256sum] = "e3ff125b0cd4f74c3b03b5399d55f1c94d92ffeb706d7483c5ec437c2dc16076"

NPM_PKGNAME = "format"

inherit npmhelper
inherit native
