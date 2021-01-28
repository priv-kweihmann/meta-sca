SUMMARY = "RubyGem: rubyntlm"
DESCRIPTION = "Ruby/NTLM provides message creator and parser for the NTLM authentication."
HOMEPAGE = "https://github.com/winrb/rubyntlm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1abaf55929270cb01e40abca2d29984f"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e1f7477acf8a7d3effb2a3fb931aa84c"
SRC_URI[sha256sum] = "5b321456dba3130351f7451f8669f1afa83a0d26fd63cdec285b7b88e667102d"

GEM_NAME = "rubyntlm"

inherit rubygems
