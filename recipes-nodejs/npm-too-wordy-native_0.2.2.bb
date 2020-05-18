SUMMARY = "NPM: too-wordy"
DESCRIPTION = "Find wordy or unnecessary passages in your writing"
HOMEPAGE = "https://github.com/duereg/too-wordy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ad1ea741b5c8f9d521103277c196d2dd"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/too-wordy/-/too-wordy-0.2.2.tgz"
SRC_URI[md5sum] = "ccf78d4ae7db2a1fa04e7cf56b0727b0"
SRC_URI[sha256sum] = "d4aaba004b15dcd5a2b66a33bca6a9ccf3559d85a638635d3e2b176846fa4cbf"

NPM_PKGNAME = "too-wordy"

inherit npmhelper
inherit native
