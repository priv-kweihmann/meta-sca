SUMMARY = "NPM: no-cliches"
DESCRIPTION = "Find clichés in your writings"
HOMEPAGE = "https://github.com/duereg/no-cliches"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/no-cliches/-/no-cliches-0.2.2.tgz"
SRC_URI[md5sum] = "87c10260fad81e9a1a6591d49ab1ba96"
SRC_URI[sha256sum] = "8c8ccb4ca3156165bfb8c1f7cc0664fb1db97cb66fdd5f03bdef174a742c835e"

NPM_PKGNAME = "no-cliches"

inherit npmhelper
inherit native
