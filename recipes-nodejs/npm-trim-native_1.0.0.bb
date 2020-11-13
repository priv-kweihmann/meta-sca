SUMMARY = "NPM: trim"
DESCRIPTION = "Trim string whitespace"
HOMEPAGE = "https://github.com/component/trim#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://Readme.md;beginline=56;md5=b45d61f441ee044a3ad2d6cdac00aa86"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/trim/-/trim-1.0.0.tgz"
SRC_URI[md5sum] = "7a7dd482448d1a95f97ed05cabd81a15"
SRC_URI[sha256sum] = "3ab37fd6ad7499171f6cf9466c65d8ad9a521e07f5adb21888e71c0cd832bc22"

NPM_PKGNAME = "trim"

inherit npmhelper
inherit native
