SUMMARY = "NPM: too-wordy"
DESCRIPTION = "Find wordy or unnecessary passages in your writing"
HOMEPAGE = "https://github.com/duereg/too-wordy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/too-wordy/-/too-wordy-0.3.1.tgz"
SRC_URI[md5sum] = "1c9ef3ab85bc0d1f862e771d79b0a485"
SRC_URI[sha256sum] = "a45d7fb12b75e2a749232b2878fee1803f1aa8f4fba17ff423fae5931138bbf9"

NPM_PKGNAME = "too-wordy"

inherit npmhelper
inherit native
