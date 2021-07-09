SUMMARY = "NPM: flatted"
DESCRIPTION = "A super light and fast circular JSON parser."
HOMEPAGE = "https://github.com/WebReflection/flatted#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73d317079e156478653d02207ca984da"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/flatted/-/flatted-3.2.1.tgz"
SRC_URI[md5sum] = "bf8b326e00ec6a6802dda17bb4c33b9b"
SRC_URI[sha256sum] = "58d84dc91bad7e87a7dbe1623dfdf5dad7e197742d36e162de94ca4818d26ecc"

NPM_PKGNAME = "flatted"

inherit npmhelper
inherit native
