SUMMARY = "NPM: too-wordy"
DESCRIPTION = "Find wordy or unnecessary passages in your writing"
HOMEPAGE = "https://github.com/duereg/too-wordy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/too-wordy/-/too-wordy-0.3.0.tgz"
SRC_URI[md5sum] = "a4cea803656fee8b70e39320be77f37b"
SRC_URI[sha256sum] = "306e5a1427bbbe4ff34584af080d9afb3958313d3b31c7d8baabc651f1dd4982"

NPM_PKGNAME = "too-wordy"

inherit npmhelper
inherit native
