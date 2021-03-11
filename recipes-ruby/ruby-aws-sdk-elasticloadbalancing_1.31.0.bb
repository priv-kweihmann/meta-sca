SUMMARY = "RubyGem: aws-sdk-elasticloadbalancing"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "113198cac9163b51676603aee25ed2ec"
SRC_URI[sha256sum] = "630f8a47d4de0ce280f0b442a67a5bd40915149f6e82007cb5ba7b611bea7748"

GEM_NAME = "aws-sdk-elasticloadbalancing"

inherit rubygems
