SUMMARY = "NPM: gensync"
DESCRIPTION = "Allows users to use generators in order to write common functions that can be both sync or async."


LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4edef26a9728782f6e6a4ca612cfc1fb"

SRC_URI = "https://registry.npmjs.org/gensync/-/gensync-1.0.0-beta.1.tgz"
SRC_URI[md5sum] = "d49975ab550b10e3f12ed18fa63ad3c0"
SRC_URI[sha256sum] = "e4d8efd55079e107841b2903661fa7bb163b9d72c93676b34678c3f6bac1e7c7"

NPM_PKGNAME = "gensync"

inherit npmhelper
inherit native
