SUMMARY = "NPM: trim"
DESCRIPTION = "Trim string whitespace"
HOMEPAGE = "https://github.com/component/trim#readme"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://Readme.md;beginline=56;md5=b45d61f441ee044a3ad2d6cdac00aa86"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trim/-/trim-0.0.3.tgz"
SRC_URI[md5sum] = "fe58e00eadcc03c88dfa13b87018dee6"
SRC_URI[sha256sum] = "0aa19275ed3cb5650b888262ed08aa45e27865f7eeb65b7ca7d004bd34c7e277"

NPM_PKGNAME = "trim"

inherit npmhelper
inherit native
