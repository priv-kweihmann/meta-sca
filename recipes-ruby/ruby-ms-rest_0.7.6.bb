SUMMARY = "RubyGem: ms_rest"
DESCRIPTION = "Azure Client Library for Ruby."
HOMEPAGE = "https://aka.ms/azure-sdk-for-ruby"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6000442264015a23894024af9930539b"

DEPENDS = ""
RDEPENDS_${PN} += "ruby-concurrent-ruby \
                  ruby-faraday \
                  ruby-timeliness"

SRC_URI[md5sum] = "039005ab5aadae9efcd8ba6bf5befd2c"
SRC_URI[sha256sum] = "272a1d592594c5c25edd2f3378c17ac9d840a29991572fb1bc7616d5565030ca"

GEM_NAME = "ms_rest"

inherit rubygems
