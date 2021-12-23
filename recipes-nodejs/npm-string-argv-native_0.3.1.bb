SUMMARY = "NPM: string-argv"
DESCRIPTION = "string-argv parses a string into an argument array to mimic process.argv. This is useful when testing Command Line Utilities that you want to pass arguments to."
HOMEPAGE = "https://github.com/mccormicka/string-argv"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2bc3f7a1a9c162a81e69e8aac9f248fe"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/string-argv/-/string-argv-0.3.1.tgz"
SRC_URI[md5sum] = "c865682c112f24422b82a3f5139bf77e"
SRC_URI[sha256sum] = "4f41b101c89ca29e53d10ac69af872d885be3f7d38ef979997fa3c60900a1e80"

NPM_PKGNAME = "string-argv"

inherit npmhelper
inherit native
