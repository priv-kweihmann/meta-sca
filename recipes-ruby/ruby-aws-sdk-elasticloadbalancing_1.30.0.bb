SUMMARY = "RubyGem: aws-sdk-elasticloadbalancing"
DESCRIPTION = "Official AWS Ruby gem for Elastic Load Balancing"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "d879a0f7f0bb317618b00fb2696105a8"
SRC_URI[sha256sum] = "b1191434ef76f24e6cdc1b51eb1fd2f914e2df3ac6bc58262aa6620c07d5dad8"

GEM_NAME = "aws-sdk-elasticloadbalancing"

inherit rubygems
