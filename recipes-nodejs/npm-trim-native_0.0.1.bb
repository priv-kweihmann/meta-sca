SUMMARY = "NPM: trim"
DESCRIPTION = "Trim string whitespace"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Readme.md;beginline=50;md5=91ff48fc4a81c4492fa901a5752d6273"

SRC_URI = "https://registry.npmjs.org/trim/-/trim-0.0.1.tgz"
SRC_URI[md5sum] = "899c3ca32e5122b240ba7d862bc66da5"
SRC_URI[sha256sum] = "1ba51464620dddb322062585b02f3f0ad12b82f5acef319c158fce0c99339cb6"

NPM_PKGNAME = "trim"

inherit npmhelper
inherit native
