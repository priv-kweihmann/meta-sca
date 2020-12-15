SUMMARY = "RubyGem: rubyntlm"
DESCRIPTION = "Ruby/NTLM provides message creator and parser for the NTLM authentication."
HOMEPAGE = "https://github.com/winrb/rubyntlm"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1abaf55929270cb01e40abca2d29984f"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e74146db2e08c5254d15d63f0befcc78"
SRC_URI[sha256sum] = "be81d7cbe7042c3a582299d89f0b07ef142b9854d260b648b498ad49a7eecbdc"

GEM_NAME = "rubyntlm"

inherit rubygems
