SUMMARY = "RubyGem: method_source"
DESCRIPTION = "retrieve the sourcecode for a method"
HOMEPAGE = "http://banisterfiend.wordpress.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c63cba9aa4fa8e06779220481f7dc4f"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "2e003787bae7718f60e23ad441bc1874"
SRC_URI[sha256sum] = "d779455a2b5666a079ce58577bfad8534f571af7cec8107f4dce328f0981dede"

GEM_NAME = "method_source"

inherit rubygems
