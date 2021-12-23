SUMMARY = "NPM: eventemitter3"
DESCRIPTION = "EventEmitter3 focuses on performance while maintaining a Node.js AND browser compatible interface."
HOMEPAGE = "https://github.com/primus/eventemitter3#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4089df5313a98fce4a7ff1738a3e4f1a"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eventemitter3/-/eventemitter3-4.0.7.tgz"
SRC_URI[md5sum] = "465d21deadc2d5ac9ac2101221a6857d"
SRC_URI[sha256sum] = "703cdecfa6951d9ad258f615ab96895750add3cb2d95e3727837b78709975de8"

NPM_PKGNAME = "eventemitter3"

inherit npmhelper
inherit native
