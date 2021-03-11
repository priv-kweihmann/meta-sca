SUMMARY = "RubyGem: aws-sdk-codepipeline"
DESCRIPTION = "Official AWS Ruby gem for AWS CodePipeline (CodePipeline)"
HOMEPAGE = "https://github.com/aws/aws-sdk-ruby"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += ""
RDEPENDS_${PN} += "ruby-aws-sdk-core \
                  ruby-aws-sigv4"

SRC_URI[md5sum] = "e20143b2bb17cbcc237e53e0472abe15"
SRC_URI[sha256sum] = "5093d594860a3257e54d9034e945cf7148e7e24bc7a47699774a531edd080f49"

GEM_NAME = "aws-sdk-codepipeline"

inherit rubygems
