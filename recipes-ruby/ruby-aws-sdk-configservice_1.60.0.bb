SUMMARY = "RubyGem: aws-sdk-configservice"
DESCRIPTION = "Official AWS Ruby gem for AWS Config (Config Service)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "35d1c2b9495344a83dddcde9540992c3"
SRC_URI[sha256sum] = "9ab5cf374c07c03364162b64fd3a85b9953c322a9c25b6c18885dad22c629985"

GEM_NAME = "aws-sdk-configservice"

inherit rubygems
