SUMMARY = "RubyGem: aws-sdk-batch"
DESCRIPTION = "Official AWS Ruby gem for AWS Batch"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "376a1114ba27cbfc41e167b4be074740"
SRC_URI[sha256sum] = "80b99350e9977ad9958bd664c96f6241d0d16594382c0443490ad6d6f7f6a875"

GEM_NAME = "aws-sdk-batch"

inherit rubygems
