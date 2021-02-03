SUMMARY = "RubyGem: aws-sdk-ram"
DESCRIPTION = "Official AWS Ruby gem for AWS Resource Access Manager (RAM)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "8e8bd80f468d6933da587e4febe9d09d"
SRC_URI[sha256sum] = "7e4012ad6122a4fe34205fc9d27d742ef00295b0fe499cdbca0d02de3c00ad71"

GEM_NAME = "aws-sdk-ram"

inherit rubygems
