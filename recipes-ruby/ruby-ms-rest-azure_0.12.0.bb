SUMMARY = "RubyGem: ms_rest_azure"
DESCRIPTION = "Azure Client Library for Ruby."
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6000442264015a23894024af9930539b"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-concurrent-ruby \
                  ruby-faraday \
                  ruby-faraday-cookie-jar \
                  ruby-ms-rest"

SRC_URI[md5sum] = "674342c8e9e19b7aacd833295c69624c"
SRC_URI[sha256sum] = "3006060104629cf56f611bee9040023e461c748a7a97eaa601028b4cd03a231a"

GEM_NAME = "ms_rest_azure"

inherit rubygems
